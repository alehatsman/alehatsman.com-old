(defproject aleh-atsman "0.0.1"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.660"]
                 [garden "1.3.2"]]
  :plugins [[lein-cljsbuild "1.1.6"]
            [lein-garden "0.3.0"]]
  :cljsbuild {:builds {:dev {:source-paths ["src/cljs"]
                             :compiler {:output-to "dist/js/main.js"
                                        :optimizations :simple
                                        :foreign-libs [{:file "https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/languages/clojure.min.js"
                                                        :provides ["hljs.clojure"]
                                                        :requires ["hljs"]}
                                                       {:file "https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/highlight.min.js"
                                                        :externals ["src/js/highlight.js"]
                                                        :provides ["hljs"]}]}}}

                       :prod {:source-paths ["src/cljs"]
                              :compiler {:output-to "dist/js/main.js"
                                         :optimizations :advanced
                                         :pretty-print false}}}
  :garden {:builds [{:source-paths ["src/clj"]
                     :stylesheet alehatsman.styles/styles
                     :compiler {:output-to "dist/css/main.css"
                                :pretty-print? false}}]}
  :clean-targets ["dist"])
