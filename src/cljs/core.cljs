(ns core
  (:require [cljs-http.client :as http]
            [cljs.core.async :refer [<!]])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(go
  (let [response (<! (http/get "http://localhost:8080/hello"))]
    (prn response)))