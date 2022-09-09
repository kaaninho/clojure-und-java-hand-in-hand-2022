(ns cljservice.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :as reload]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World -- Hello codetalks! with reload!"})

(def with-reload-handler
  (reload/wrap-reload #'handler))

(defn start-server []
  (jetty/run-jetty with-reload-handler {:port 3012 :join? false}))

(defn -main [& args]
  (start-server))


