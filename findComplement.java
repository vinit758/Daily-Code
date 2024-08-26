class Solution {
    public int findComplement(int num) {
        String binary = "";
        while (num > 0) {
            int remi = num % 2;
            binary = remi + binary;
            num = num / 2;
        }
        char binaryarray[]=binary.toCharArray();
        char convert[]=new char[binaryarray.length];

            for(int i=0;i<binaryarray.length;i++){
                if(binaryarray[i]=='0'){
                    convert[i]='1';
                }
                else{
                    convert[i]='0';
                }
            }
            String binary2="";
            for(char j=0;j<convert.length;j++){
                binary2+=convert[j];
            }

                 return Integer.parseInt(binary2,2) ;
            }

        }

    
