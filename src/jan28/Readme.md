## Set

-It does not allow duplicate elements 
-Only one null element is allowed
-it is in random order
-internally hashSet is backed by hashMap
- In set elements is stored according to their "hashcodes".


1.HashSet---- Random order and unique and allow one null elements
              Hashset are non synchronized data structure.
              
              

2.TreeSet---- Ascending order/natural sorting order
              (*) treeSet cannot allow null elements.
              Tree set is directly implement class Navigable set but indirectly implement sorted set and set interface
              Tree set underline data structure is balanced Tree and store (*)same datatypes elements i.e homogenous datatypes
              It cannot store duplicate elements.


3.LinkedHashSet---- Insertion order and allow one null elements

## difference between floor and ceiling in treeSet functions

ceiling---- return the highest or equal

floor--- returns the small element or equal and null value return if there is no element in the Set.

Lower---it will return the greater than or small value but in equal value it will null value

poll first- it will remove the first element from set

poll last-- it will remove the last element from set

## Map

map is collection which uses key value pair.
key should be unique
only 1 null key is allowed key cannot be duplicate.
values can be duplicates or can contain null
there is no order sorting and insertion order

## TreeMap
It is implemented class of Navigable Map, but it also inherits the properties of Sorted Map and Map interface
Tree Map is underlined data structure is Red Black Tree.
Tree Map follows sorting order does not follow insertion order it sort the data according to keyset.


## Hashtable


