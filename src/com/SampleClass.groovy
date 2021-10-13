#!/usr/bin/env groovy
package src.com

class SampleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
}
