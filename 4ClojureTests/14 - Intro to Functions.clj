;; wagnersq's solution to Intro to Functions
;; https://4clojure.com/problem/14

(def answer 8)

(= answer ((fn add-five [x] (+ x 5)) 3))


(= answer ((fn [x] (+ x 5)) 3))


(= answer (#(+ % 5) 3))


(= answer ((partial + 5) 3))
