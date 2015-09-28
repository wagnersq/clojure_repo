; namespace
(ns learnclojure)

; function
(print "Hello world")

; Math operation
(+ 1 1)
(- 2 1)
(* 2 4)
(/ 4 2)
(* 3 (- 2 1))

; Object Type Verification
(type 1)
(type 1.1)
(type true)
(type "Hello")

; Macro or Map
(type :a)
(type (keyword "a"))

; Symbol
(type (quote a))
(type 'a)

; List definition
(type '(1 2 3)) ; linked list
(type (list 1 2 3))
(type '(print 2 3))
(type (print 2 3))

; Vector
(type (vector 3 2 1)) ; array
(type [3 2 1])        ; array

; Value of N-th array position
(nth (vector 9 5 13) 1)

; Value of first item of list
(first '(8 0 -9 3))

; Value of last item of list
(last '(8 0 -9 3 7))

; Map
{:a 0, :b 4, :c 2}
{:a {:b -1, :c 1}}
(type (hash-map :a 1 :b 2))

; Set
(type #{1 2 3})
(type (hash-set 1 4 5))

; Variables
(def x "Hello Clojure")

(str x)

(let [x "Wagner"]
  (print "Hello" x))

; Flow Control
; IF
(if (empty? x)
  "x is empty"
  "x is not empty")

(if nil "Yes" "No")

; IF-NOT
(def y "Y")

(if-not (empty? y)
  (do
    (println "Ok")
    :ok))

; DO
(def z "Z")

(if (empty? z)
  nil
  (do
    (println "Ok")
    :ok))

; WHEN-NOT
(def t "T")

(when-not (empty? t)
  (do
    (println "Ok")
    :ok))

(when (not (empty? t)) :ok)

; CASE
(def greeting "Hello")

(case greeting
  "Goodbye" :goodbye
  "Hello" :hello
  :nothing
)

; COND
(def g "Hello")

(cond
  (= g "Goodbye") :goodbye
  ;; (= (reverse g) "olleH") :olleH
  ;; Unreacheable because reverse returns a List of string
  (= (apply str (reverse g)) "olleH") :olleH
  :otherwise :nothing)


; Binding definition
(defn x [a b]
  (let [ab (* a b)]
    (+ ab 3)))

(x 4 3)

; Function
(fn [] "Hello") ; Annonymous function

(def hello (fn [] "Hello")) ; Named function

(defn hello [] "Hello" )    ; Named function

(defn hello [name] (str "Hello, " name))
(hello "Wagner")

(defn hello [title, name] (str "Hello, " title " " name))
; OR
(defn hello [title name] (str "Hello, " title " " name))
; OR
(defn hello "Greets a person named <name> with their <title>" [title name] (str "Hello, " title " " name))

(hello "Mr" "Wagner")

; Function documentation

(require '[clojure.repl :refer [doc]])
(doc hello)

; Function with multiples arguments
(defn hello [& args]
  (str "Hello, " (apply str args)))

; Function with diferents answers for differents caller
(defn hello
  ([] "Hello, World")            ; Answer that or
  ([name] (str "Hello, " name))  ; answer this way.
)

; Function overloaded
(defn hello
  ([] hello "World")            ; Answer that or
  ([name] (str "Hi, " name))    ; answer this way.
)

; Function prints the value of key, passing a map - 1
(defn hello [config]
  (str "Hello, " (:name config)))
(hello {:name "Joe"})

; Function prints the value of key, passing a map - 2
(defn hello [{name :name}]
  (str "Hello, " name))
(hello {:name "Joe"})

; Function prints the value a vector
(defn hello [[name title]]
  (str "Hello, " title " " name))
(hello ["Lucy" "Admiral"])

; User input function

(defn prompt [question]
  (println question)
    (read-line))

(prompt "How old are you?")

(with-in-str "34" (prompt "How old are you?")) ; Call a function and pass the parameter.

; XML function
(spit "hello.xml"
      (with-out-str
        (emit
         {:tag :parent :attrs {:value "HelloClojureWorld"}
          :content [
                   {:tag :child :attrs {:value (str (java.util.Date.))}}
                   {:tag :child :attrs {:value (System/getProperty "os.name")}}
                   {:tag :child :attrs {:value (System/getProperty "os.version")}}
                   {:tag :child :attrs {:value (System/getProperty "os.arch")}}
                   ]
          }
         )
      )
)
