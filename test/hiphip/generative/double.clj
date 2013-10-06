(ns hiphip.generative.double
  (:use hiphip.double hiphip.generative.type_impl_gen)
  (:require [clojure.test.generative :as test :refer (defspec)]
            [hiphip.generators :as gen])
  (:refer-clojure :exclude [amap areduce alength aclone aset aget]))

(def array-gen #(gen/darray 10e3))
(def range-gen #(gen/drange 10e3))
(def new-array double-array)
(defn is-type? [n] (instance? Double n))

(eval (read-string (load-type-impl-gen)))