(reduce #(map + %1((partition 3[0 0 3 0 0 1 0 1 0 0 0 -1 0 0 1 1 0 0 0 0 -1
0 0 1 0 -1 0 0 0 -1 0 0 -3 -1 0 0])(+(* 3 (%1 2))%2)))p i)
