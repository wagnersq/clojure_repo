;; wagnersq's solution to Intro to Functions - Hello World
;; https://4clojure.com/problem/16

(def answer1 (fn hello [x] (str "Hello, " x "!")))

(= (answer1 "Dave") "Hello, Dave!")

(= (answer1 "Jenn") "Hello, Jenn!")

(= (answer1 "Rhea") "Hello, Rhea!")


(def answer2 #(str "Hello, " % "!"))

(= (answer2 "Dave") "Hello, Dave!")

(= (answer2 "Jenn") "Hello, Jenn!")

(= (answer2 "Rhea") "Hello, Rhea!")
