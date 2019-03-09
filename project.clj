(defproject lein-asset-minifier-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns lein-asset-minifier-test.core}
  :plugins [[lein-asset-minifier "0.4.6"]]

  :minify-assets [[:html {:source "resources/html" :target "minified"}]
                  [:css  {:source "resources/css"  :target "minified/site.min.css"}]])
