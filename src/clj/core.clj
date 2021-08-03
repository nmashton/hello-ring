(ns core
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn handler
  [_req]
  {:status 404, :body "Not Found"})

(defn -main [& _args]
  (run-jetty handler {:port  4201
                      :join? false}))