;; wagnersq's solution to Last Element
;; https://4clojure.com/problem/19

(def answer #(first (reverse %)))

(= (answer [1 2 3 4 5]) 5)

(= (answer '(5 4 3)) 3)

(= (answer ["b" "c" "d"]) "d")


