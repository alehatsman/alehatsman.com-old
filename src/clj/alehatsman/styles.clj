(ns alehatsman.styles
  (:require [garden.def :refer [defstyles]]
            [garden.stylesheet :refer [at-media]]))

(defstyles styles [[:html {:font-size "20px"}]
                   (at-media {:min-width "768px"}
                             [:html {:font-size "23px"}])
                   (at-media {:min-width "1024px"}
                             [:html {:font-size "30px"}])
                   [:html :body {:width "100%"
                                 :height "100%"}]
                   [:body {:display "flex"
                           :justify-content "center"
                           :align-items "center"
                           :background "#f8f8f8"
                           :margin 0}]
                   [:a {:text-decoration "none"
                        :cusor "pointer"}]
                   [:code {:white-space "pre-wrap"}]])
