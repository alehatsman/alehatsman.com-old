(ns alehatsman.code
  (:require [hljs.clojure]
            [hljs :as hljs]
            [alehatsman.dom :as dom]))

(def my-info (str 
               "<code class=\"clojure\">"
               "(def aleh-atsman {:title \"Senior Software Engineer\"\n"
               "                  :status <a href=\"/files/Resume.ClojureWebDeveloper.aleh.atsman@gmail.com.pdf\" target=\"blank\">\"Looking for Clojure job\"</a>\n"
               "                  :skills [\"Clojure\" \"JavaScript\"]\n"
               "                  :github <a href=\"https://github.com/atsman\" target=\"blank\">\"https://github.com/atsman\"</a>\n"
               "                  :blog <a href=\"https://t.me/coding_around\" target=\"blank\">\"https://t.me/coding_around\"</a>\n"
               "                  :email <a href=\"mailto:aleh.atsman@gmail.com\" target=\"blank\">\"aleh.atsman@gmail.com\"</a>\n"
               "<code>"))

(defn code [el]
  "code component renders html to provided element"
  (set! (.-innerHTML el) my-info)
  (hljs/highlightBlock (dom/query-selector "code")))
