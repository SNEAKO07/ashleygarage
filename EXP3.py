source=open("C:/Users/91966/Desktop/SSCD/input_3.txt",'r').read()
lines=source.splitlines()
names=[]
bodies=[]
for line in lines:
    if'#define' in line:
        line=line.split(' ')
        fun_name=line[1][:line[1].find('(')]
        names.append(fun_name)
        bodies.append(line[2])
d=dict(zip(names,bodies))
for line in lines:
    if'#define' not in line:
        for name in names:
            if name in line:
                line=line.replace(name,'').replace('(','').replace(')','')
                line=line.replace(';','')
                line=d[name].replace('X',line[0])+';'
                line=line.replace('(','').replace(')','')
        print(line)