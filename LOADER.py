print("ASHLEY JOHN ARAKAL   URK19CS1064")
f=open("C:/Users/91966/Desktop/SSCD/input_5.txt",'r')
lines=f.readlines()
address=0
name=""
for i in lines:
    mylist=list()
    mylist=i.split("^")
    if mylist[0]=='H':
        address=int(mylist[2])
        name=mylist[1]
        print("enter program name: "+name)
        print("name from obj. "+name)
    elif mylist[0]=='T':
        address=int(mylist[1])
        mylist=i.split("^")
        mystr=""
        for i in range(3,len(mylist)):
            mystr=mylist[i]
            print("00"+str(address)+"-->"+mystr[0:2])
            address=address+1
            print("00"+str(address)+"-->"+mystr[2:4])
            address+=1
            print("00"+str(address)+"-->"+mystr[4:6])
            address+=1
    elif mylist[0]=='E':
        print("Done")