PUSH D0
MOV SP D0
PUSH 0(D0)
ADD SP #1 SP
PUSH 1(D0)
ADD SP #1 SP
PUSH 2(D0)
ADD SP #1 SP
PUSH 3(D0)
ADD SP #1 SP
PUSH 4(D0)
ADD SP #1 SP
PUSH 5(D0)
ADD SP #1 SP
PUSH #55
POP 2(D0)
PUSH #65
POP 1(D0)
PUSH #10
POP 3(D0)
PUSH 2(D0)
PUSH 1(D0)
CMPLTS
NOTS
BRFS L0
PUSH #9000000
WRTS
BR L1
L0:
PUSH 2(D0)
RD 2(D0)
L1:
PUSH 2(D0)
PUSH 1(D0)
CMPLTS
BRFS L2
PUSH #1
WRTS
BR L3
L2:
PUSH #20
POP 2(D0)
L3:
PUSH 2(D0)
PUSH 3(D0)
CMPEQS
BRFS L4
PUSH 1(D0)
PUSH 3(D0)
CMPGTS
BRFS L5
PUSH 2(D0)
PUSH 3(D0)
CMPGTS
BRFS L6
PUSH #100000
WRTS
BR L7
L6:
PUSH #5
PUSH #2
ADDS
PUSH #1
PUSH #6
ADDS
CMPEQS
BRFS L8
PUSH #2
WRTS
BR L9
L8:
L9:
L7:
BR L10
L5:
L10:
BR L11
L4:
PUSH #100000
WRTS
L11:
PUSH 2(D0)
PUSH 1(D0)
CMPGTS
PUSH 2(D0)
PUSH 3(D0)
CMPGTS
ORS
PUSH 2(D0)
PUSH 3(D0)
CMPEQS
ORS
BRFS L12
PUSH 2(D0)
PUSH 3(D0)
CMPNES
NOTS
BRFS L13
PUSH 1(D0)
PUSH 2(D0)
CMPLTS
PUSH 3(D0)
PUSH 3(D0)
CMPNES
NOTS
ORS
BRFS L14
PUSH 1(D0)
PUSH #55
CMPEQS
BRFS L15
PUSH #100000
WRTS
BR L16
L15:
PUSH #3
WRTS
L16:
BR L17
L14:
PUSH #200000
WRTS
L17:
BR L18
L13:
L18:
BR L19
L12:
PUSH #300000
WRTS
L19:
HLT
