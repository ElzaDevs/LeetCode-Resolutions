// HASHMAP CRIANDO IMPLEMENTAÇÃO DE MAP
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
Map<Integer, Integer> d = new HashMap<>(); // dicionário vazio

// guarda números como chaves e índices como valores.
for (int i = 0; i < nums.length; i++) {
        d.put(nums[i], i);
        }

// percorre novamente para verificar complementos.
for (int i = 0; i < nums.length; i++) {
    int x = target - nums[i]; // calcula complemento
    if (d.containsKey(x) && d.get(x) != i) { // verifica se já existe
    return new int[] { i, d.get(x) }; // retorna os índices
            }
        }

    return null; // se não encontrar
    }
}
