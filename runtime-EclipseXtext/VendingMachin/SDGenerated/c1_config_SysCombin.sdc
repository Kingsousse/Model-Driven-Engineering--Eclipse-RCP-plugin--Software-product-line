Features {
ProCard
Password
Help
free
CancelProcess
Coffee
Tea
ColdProduct
}

Combination {
alt [ "ProCard" ] {
ProCard
 else 
Password

}
opt ["Help == True"] {
Help

}
loop [" while UserDesire == TRUE "] {
free
alt ["CancelProcess  == True"] {
CancelProcess
 else 
alt [ "Coffee" ] {
Coffee
 else 
alt [ "Tea" ] {
Tea
 else 
ColdProduct

}

}

}

}
}
