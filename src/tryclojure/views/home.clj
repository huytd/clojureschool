(ns tryclojure.views.home
  (:require [hiccup.element :refer [javascript-tag link-to unordered-list]]
            [hiccup.page :refer [include-css include-js html5]]
            [hiccup.core :refer [html]]))

(defn home-html []
  (html
    [:p.bottom
      "Chào mừng bạn đến với Clojure! "
      "Cái khung màu trắng ở trên nó gọi là <em>REPL</em>."]
    [:p.bottom "Gõ <code>next</code> vào REPL để bắt đầu khoá học nhé :)" ]))

(defn root-html []
  (html5
   [:head
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    (include-css "/css/tryclojure.css"
                 "/css/gh-fork-ribbon.css"
                 "https://fonts.googleapis.com/css?family=Open+Sans:300,400,700&subset=latin,vietnamese")
    (include-js "//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"
                "/javascript/jquery-console/jquery.console.js"
                "/javascript/tryclojure.js")
    [:title "Clojure School"]]
   [:body
    [:div#wrapper
     [:div#header "<b>clojure</b>school"]
     [:div#content
      [:div#container
       [:div#console.console]
       [:div#changer (home-html)]]
      [:div.footer
       [:p.bottom "Phiên bản việt hoá của <b>tryclj.com</b>"]]
      (javascript-tag
       "var _gaq = _gaq || [];
        _gaq.push(['_setAccount', 'UA-27340918-1']);
        _gaq.push(['_trackPageview']);

        (function() {
          var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
          ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
          var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
        })();")]]]))
