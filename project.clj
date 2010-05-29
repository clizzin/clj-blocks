(defproject clj-blocks
  "0.0.1"
  :description "a web framework inspired by Weblocks"
  :dependencies [[org.clojure/clojure "1.2.0-master-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.2.0-SNAPSHOT"]
                 [sandbar "0.2.3"]
                 [hiccup "0.2.3"]
                 [clout "0.2.0"]
                 [compojure "0.4.0-SNAPSHOT"]
		 [ring/ring-core "0.2.0"]
		 [ring/ring-devel "0.2.0"]
		 [ring/ring-jetty-adapter "0.2.0"]]
  :dev-dependencies [[leiningen/lein-swank "1.1.0"]
		     [swank-clojure "1.2.0-SNAPSHOT"]
		     [jline "0.9.94"]])