(ns alehatsman.code
  (:require [highlight.clojure]
            [alehatsman.dom :as dom]))

(def my-info (str 
               "<code class=\"clojure\">"
               "(def aleh-atsman {:title \"Senior Software Engineer\"\n"
               "                  :status <a href=\"/files/Resume.ClojureWebDeveloper.aleh.atsman@gmail.com.pdf\" target=\"blank\">\"Looking for Clojure job\"</a>\n"
               "                  :skills [\"Clojure\" \"JavaScript\"]\n"
               "                  :github <a href=\"https://github.com/atsman\" target=\"blank\">\"https://github.com/atsman\"</a>\n"
               "                  :email <a href=\"mailto:aleh.atsman@gmail.com\" target=\"blank\">\"aleh.atsman@gmail.com\"</a>\n"
               "                  :skype <a href=\"skype:oleg.atsman?userinfo\" target=\"blank\">\"oleg.atsman\"</a>})\n"
               "<code>"))

(defn code [el]
  "code component renders html to provided element"
  (set! (.-innerHTML el) my-info)
  (js/hljs.highlightBlock (dom/query-selector "code")))
