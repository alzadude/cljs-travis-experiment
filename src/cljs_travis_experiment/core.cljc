(ns cljs-travis-experiment.core
  #?(:clj (:gen-class)))

(defn -main [& args]
  (println "Hello World!"))

#?(:cljs (set! *main-cli-fn* -main))