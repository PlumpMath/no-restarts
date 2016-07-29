(set-env!
 :source-paths #{"src"}
 :dependencies '[[org.danielsz/system "0.3.1-SNAPSHOT"]])

(require '[system.boot :refer [system]])

(deftask dev
  []
  (comp
   (watch :verbose true)
   (system :auto true)
   (repl :server true)))
