print("ASHLEY JOHN ARAKAL URK19CS1064")
NoState=int(input("Enter number of states : "))
states=[input("Enter the state : ")for i in range(0,NoState)]

symbols=int(input("Enter number of input symbols : "))
sym=[input("Enter input symbols : ") for i in range(0,symbols)]
print('The input symbols are: ' + ' , '.join(sym))
last=input('Specify the final stage: ')
k=[0 for i in range(len(states))]
for i in range(len(states)):
  k[i]=[0 for j in range(len(sym))]
  for j in range(len(sym)):
    k[i][j]=input('From ' + states[i]+' if ' + str(sym[j])+ ' go: ')
def trans(q,w):
  lis.append(k[states.index(q)][sym.index(w)])
  return k[states.index(q)][sym.index(w)]
cont='y'
while cont=='y' or cont=='Y':
  lis=[]
  start=states[0]
  w=input("string to check: ")
  for i in w:
    start=trans(start,i)
  if lis[-1] == last:
    print("String Accepted ("+states[0] + '-->' + '-->'.join(lis)+')')
  else:
    print('String not accepted...')
  cont=input('Do you wish to continue? : ')
