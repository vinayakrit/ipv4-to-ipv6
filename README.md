# ipv4-to-ipv6


An IPv4 address : example 192.168.99.1

Step1 >

Divide the first octet (192) by 16 (since Hex is a Base-16) IE : 192/16 = 12 times exactly with 0 left over – 12 in Hex is represented as C – 0 (zero) in Hex is, you guessed it, 0 Thus 192 in HEX is C0

Step2 >

Repeat step 1 with the second octet (168), IE : 168/16 = 10 times with 8 left over because 10*6 = 160, – 10 in HEX is A – 8 in HEX is 8 Thus 168 in HEX is A8

Step3 >

Repetition rules!!! Third octet (99) IE : 99/16 = 6 times with 3 left over – 6 in HEX is 6 – 3 in HEX is 3 Thus 99 in HEX is 63

Step4 >

Last octet IE : 1/16 = 0 times with 1 left over – 0 in HEX is, yeah it is 0 – 1 in HEX is 1 Thus 1 in HEX is 01

So the IPv4 address of 192.168.99.1, represented in the IPv6 address portion would be C0A8:6301. However you have to use lower case and add all the missing bytes IPv6, so the correct code is:

::c0a8:6301

or you can use a syntax now always accepted:

::192.168.99.1

So in the end a IPv6 address can be the old address with the :: chars before the old address.
