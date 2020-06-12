
# STONE PAPER SCISSOR

import random
print("STONE PAPER SCISSOR")
c,p,t =0,0,0
'''
c computer
p player
t turns
'''
print("1 stone\t2 paper\t3 scissor")
list = [1,2,3]
while(t<10):
    e = int(input("Enter choice : "))
    #e player's choice
    n = random.choice(list)
    #n cpmputer's choice
    '''
    # w result for player
    # 0 tie
    # 1 win
    # -1 lose
    '''
    #STONE
    if (e == 1):
        if (n == 1):
            w = 0
        if (n == 2):
            w = -1
        if (n == 3):
            w = 1
    #PAPER
    if (e == 2):
        if (n == 1):
            w = 1
        if (n == 2):
            w = 0
        if (n == 3):
            w = -1
#     #SCISSOR
    if (e == 3):
        if (n == 1):
            w = -1
        if (n == 2):
            w = 1
        if (n == 3):
            w = 0
    print("Round goes to ",end="")
    if(w == 1):
        p+=1
        print("Player")
    elif(w == -1):
        c+=1
        print("Computer")
    else:
        print("Draw")
    t += 1

print("Player   :",p,"\nComputer :",c)
if(p > c):
    print("WINNER : PLAYER!")
elif(c > p):
    print("WINNER : COMPUTER!")
else:
    print("GAME IS  TIE!")

