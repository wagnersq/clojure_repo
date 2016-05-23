;; wagnersq's solution to Intro to Sets
;; https://4clojure.com/problem/8

(def answer (set '(:a :b :c :d)))

(= answer (set '(:a :a :b :c :c :c :c :d :d)))

(= answer (clojure.set/union #{:a :b :c} #{:b :c :d}))
