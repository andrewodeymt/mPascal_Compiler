PUSH D0
MOV SP D0
PUSH 0(D0)
ADD SP #1 SP
PUSH 1(D0)
ADD SP #1 SP
PUSH #1
POP 1(D0)
PUSH #10
POP 0(D0)
PUSH 1(D0)
PUSH 0(D0)
CMPEQS
WRTS
PUSH 1(D0)
PUSH 0(D0)
CMPLTS
WRTS
PUSH 1(D0)
PUSH 0(D0)
CMPGTS
WRTS
PUSH 1(D0)
PUSH 0(D0)
CMPLES
WRTS
PUSH 1(D0)
PUSH 0(D0)
CMPGES
WRTS
PUSH 1(D0)
PUSH 0(D0)
CMPNES
WRTS
PUSH 1(D0)
PUSH 0(D0)
CMPLTS
BRFS L0
PUSH 1(D0)
WRTS
BR L1
L0:
PUSH 0(D0)
WRTS
L1:
PUSH 1(D0)
PUSH 0(D0)
CMPGTS
BRFS L2
PUSH 1(D0)
WRTS
BR L3
L2:
PUSH 0(D0)
WRTS
L3:
PUSH 1(D0)
PUSH 0(D0)
CMPLES
BRFS L4
PUSH 1(D0)
WRTS
BR L5
L4:
PUSH 0(D0)
WRTS
L5:
PUSH 1(D0)
PUSH 0(D0)
CMPGES
BRFS L6
PUSH 1(D0)
WRTS
BR L7
L6:
PUSH 0(D0)
WRTS
L7:
PUSH 1(D0)
PUSH 0(D0)
CMPEQS
BRFS L8
PUSH 1(D0)
WRTS
BR L9
L8:
PUSH 0(D0)
WRTS
L9:
PUSH 1(D0)
PUSH 0(D0)
CMPNES
BRFS L10
PUSH 1(D0)
WRTS
BR L11
L10:
PUSH 0(D0)
WRTS
L11:
PUSH #1
PUSH #8
ADDS
PUSH #8
CMPGTS
BRFS L12
PUSH #1
WRTS
BR L13
L12:
PUSH #0
WRTS
L13:
PUSH #20
PUSH #4
MODS
PUSH #5
MULS
PUSH #0
CMPEQS
BRFS L14
PUSH #1
WRTS
BR L15
L14:
PUSH #0
WRTS
L15:
PUSH #20
PUSH #4
ADDS
PUSH #3
PUSH #3
ADDS
DIVS
PUSH #10000
PUSH #63
PUSH #14
ADDS
MODS
NEGS
CMPGTS
BRFS L16
PUSH #1
WRTS
BR L17
L16:
PUSH #0
WRTS
L17:
HLT