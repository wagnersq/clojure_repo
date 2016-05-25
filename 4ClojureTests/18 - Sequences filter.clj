;; wagnersq's solution to Sequences filter
;; https://4clojure.com/problem/18

(def answer '(6 7))

(= answer (filter #(> % 5) '(3 4 5 6 7)))
