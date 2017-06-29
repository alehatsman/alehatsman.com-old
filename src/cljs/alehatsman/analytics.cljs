(ns alehatsman.analytics
  (:require [alehatsman.dom :as dom]))

(defn get-href [target]
  (if (nil? (.-href target))
    (get-href (.-parentElement target))
    (.-href target)))

(defn handle-outbound-click [event]
  (js/ga "send" (clj->js {"hitType" "event"
                          "eventCategory" "Outbound Link"
                          "eventAction" "click"
                          "eventLabel" (get-href (.-target event))
                          "transport" "beacon"})))

(defn attach-event-handlers []
  (let [links (dom/query-selector-all "a")]
        (doseq [link links]
          (.addEventListener link "click" handle-outbound-click))))
