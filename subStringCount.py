def count_substring(string, sub):
    l = len(string)
    count = 0
    for i in range(0, l-2):
        if string[i: i+ len(sub)] == sub:
            count+=1
   
    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
