package com.br.projeto.pizza.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.projeto.pizza.model.PizzaModel;

@Service
public class PizzaService {
	
	private Map<Integer, PizzaModel> pizzas = new HashMap<Integer, PizzaModel>(){
		{
			put(1, new PizzaModel( "Calabresa", "Napolitana", "Catupiri", 21.00));
			put(2, new PizzaModel("Mussarela", "fina", "Cheddar", 33.00));
			
		}
	
	};
	
	public Collection<PizzaModel> voltarpizzas(){
		return this.pizzas.values();
	}
	public void salvarPizzas(PizzaModel pizzaModel) {
		pizzas.put(pizzas.size()+1, pizzaModel);
	}
	
}
