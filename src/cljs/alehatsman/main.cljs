(ns alehatsman.main
  (:require [alehatsman.dom :as dom]
            [alehatsman.analytics :as analytics]
            [alehatsman.code :refer [code]]))

(defn render-app []
  (code (dom/query-selector ".app")))

(render-app)
(analytics/attach-event-handlers)
