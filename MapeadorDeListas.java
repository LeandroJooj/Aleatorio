Map<String, Integer> metodo1(Integer... inteiro){ 
   ...>        List<Integer> a = new ArrayList<>();
   ...>        List<String> b = new ArrayList<>();
   ...>        
   ...>        for(Integer x=0;x < inteiro.length;x++){
   ...>            a.add(inteiro[x]);
   ...>            b.add(x.toString());
   ...>        }
   ...>        Map<String,Integer> map = new HashMap<String,Integer>();
   ...> 
   ...>        for(Integer agy = 0; agy < a.size(); agy++){
   ...>             map.put("a"+b.get(agy),a.get(agy));
   ...>        }
   ...>             
   ...>        return map;
   ...>   }

//Tem essas setas por causa do Jshell
