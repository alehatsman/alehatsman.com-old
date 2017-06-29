(ns alehatsman.dom)

(defn query-selector [selector]
  (js/document.querySelector selector))

(defn query-selector-all [selector]
  (array-seq (js/document.querySelectorAll selector)))
