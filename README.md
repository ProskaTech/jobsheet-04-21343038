## Object-oriented Programming (Lab Work) Template Guides
//Created by 21343038_AbelLevran
1. JS 4 ini kita mengimplementasikan tentang operator pada java, yaitu;
2. Unary Operator = penjumlahan(+),pengurangan(-),perkalian(*), pembagian(/), modulus(%)= sisa hasil bagi
3. binary Operator = Arithmetic,relational,logical,bitwise,assigment
4. operator logika + bollean ,yg digunakan pada program ada AND(&&),OR(||) / (|),NOT
5. pada operator AND ada && dan &
6. contoh; [ test = (i > j) && (j++ > 9); ] dan [ test = (i > j) & (j++ > 9); ]
7. operator && adalah perbandingan 2 kondisi,jika operator kiri true maka operator kanan akan dijalankan,tetapi jika operator yang kiri bernilai false, maka operasi yang kanan tidak akan di jalankan, karena sudah pasti hasilnya akan false.
8. tetapi pada &, kedua operator kiri dan kanan akan dijalan walaupun sebelah kiri bernilai false.
9. pada operator OR ada || dan |
10. operator || perbandingan 2 kondisi, jika operator kiri true maka cukup sampai situ, operator kanan di dijalankan, tetapi jika operator kiri bernilai false, dilanjukan operator di kanan
11. operator | , operator kiri dan kanan pasti akan di evaluasi apapun kondisinya 
12. terkakhir Ternary Operator, yaitu kondisi(?:).
13. contohnya pada konidiOperator & konidiOperator1
14. int score = 0;
        char answer = 'a';
        
        score = (answer == 'b') ? 10 : 0;
        System.out.println("Score = " +score);

jika pada score kita mengisi nilainya dengan 'a' maka, hasil yang akan diambil lalu ditampilkan/output = 10, tetapi disitu kita mengisi dengan 'b' maka hasilnya yg diambil adalah yg dikanan = 0. 
