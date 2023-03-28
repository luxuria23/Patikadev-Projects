# Insertion Sort
[22, 27, 16, 2, 18, 6]		   
[22, 27, 16, 2, 18, 6]		İkinci öğeyle başlarız    
[22, 27, 16, 2, 18, 6]	    27 & 22'yi karşılaştırırız	27, 22'den büyük  doğru sırada bulunuyor      
[22, 27, 16, 2, 18, 6]		Bir sonraki öğeye geçin (16)      
[22, 16, 27, 2, 18, 6]	    16 & 27'yi karşılaştırırız	16, 27'den küçük , yerlerini değiştiririz    
[22, 16, 27, 2, 18, 6]	    16 & 22'yi karşılaştırırız	16, 22'den küçük  yerlerini değiştiririz    
[16, 22, 27, 2, 18, 6]	    2 & 27'yi karşılaştırırız	2, 27'den küçük  yerlerini değiştiririz    
[16, 22, 2, 27, 18, 6]	    2 & 22'yi karşılaştırırız	2, 22'den küçük  yerlerini değiştiririz    
[16, 2, 22, 27, 18, 6]	    2 & 16'yı karşılaştırırız	2, 16'dan küçük  yerlerini değiştiririz    
[2, 16, 22, 27, 18, 6]	    18 & 27'yi karşılaştırırız	18, 27'den küçük  yerlerini değiştiririz    
[2, 16, 22, 18, 27, 6]	    18 & 22'yi karşılaştırırız	18, 22'den küçük  yerlerini değiştiririz    
[2, 16, 18, 22, 27, 6]  	6 & 22'yi karşılaştırırız	6, 22'den küçük  yerlerini değiştiririz    
[2, 16, 18, 6, 22, 27]	    6 & 16'yı karşılaştırırız	6, 16'dan küçük  yerlerini değiştiririz    
[2, 6, 16, 18, 22, 27]      6 & 2'yi karşılaştırırız	6, 2'den büyük     


### Complexity

En iyi durum için: O(n) olacaktır    

En kötü durum için: O(n^2) olacaktır     

Ortalama karmaşıklık: O(n^2) olacaktır    

### Diziyi sıraladıktan sonra 18 sayısının durumu

18 sayısı ilk tekrarda bulunacağı için en iyi senaryoya girecektir    

## Selection Sort

ilk 4 adım aşağıdaki gibidir    

[7, 3, 5, 8, 2, 9, 4, 15, 6]    
[2, 3, 5, 8, 7, 9, 4, 15, 6]    
[2, 3, 5, 8, 7, 9, 4, 15, 6]     
[2, 3, 4, 8, 7, 9, 5, 15, 6]    
[2, 3, 4, 5, 7, 9, 8, 15, 6]    
