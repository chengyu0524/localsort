package chay.sort;

public class sort3 {
//	基位排序
	
/*
	假设有如下数字：
    91,2,832,99,83,7
经过基数排序第一次扫描之后， 数字被分配到如下盒子中：
    Bin 0:
    Bin 1: 91
    Bin 2: 2,832
    Bin 3: 83
    Bin 4:
    Bin 5: 
    Bin 6: 
    Bin 7: 7
    Bin 8:
    Bin 9: 99
根据盒子的顺序， 对数字进行第一次排序的结果如下：
    91,2,832,83,7,99
然后根据十位上的数值再将上次排序的结果分配到不同的盒子中：
    Bin 0: 2,7
    Bin 1: 
    Bin 2: 
    Bin 3: 832
    Bin 4: 
    Bin 5:
    Bin 6:
    Bin 7:
    Bin 8: 83 
    Bin 9: 91,99
最后， 将盒子中的数字取出， 组成一个新的列表， 该列表即为排好序的数字：
    2,7,832,83,91,99
    然后根据百位上的数值再将上次排序的结果分配到不同的盒子中：
    Bin 0: 2,7,83,91,99
    Bin 1: 
    Bin 2: 
    Bin 3: 
    Bin 4: 
    Bin 5:
    Bin 6:
    Bin 7:
    Bin 8: 832 
    Bin 9: 
最后， 将盒子中的数字取出， 组成一个新的列表， 该列表即为排好序的数字：
	2,7,83,91,99,832
*/
}