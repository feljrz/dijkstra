/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algoritimodijkstra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author felipe
 */
public class Dijkstra {
    // public static 

    private static Vertice getVerticeProx(Set< Vertice> naoVisitados) {
        Vertice menorDistanciaVertice = null;
        int menorDistancia = Integer.MAX_VALUE;
        
        for (Vertice vertice : naoVisitados) {
            int nodeDistancia = vertice.getDistanciaTotal();
           
            if (nodeDistancia < menorDistancia) {
                menorDistancia = nodeDistancia;
                menorDistanciaVertice = vertice;
            }
        }

        return menorDistanciaVertice;
    }

   public static Grafo menorDistancia(Grafo grafo, Vertice origem) {
    origem.setDistanciaTotal(0);
 
    Set<Vertice> visitados = new HashSet<>();
    Set<Vertice> naoVisitado = new HashSet<>();
 
    naoVisitado.add(origem);
 
    while (naoVisitado.size() != 0) {
        Vertice verticeAtual = getVerticeProx(naoVisitado);
        naoVisitado.remove(verticeAtual);
        for (Map.Entry <Vertice,Integer> entry: verticeAtual.getAdjacentes().entrySet()) {
           
            if (!visitados.contains(entry.getKey())) {
                 if (verticeAtual.getDistanciaTotal() + entry.getValue() < entry.getKey().getDistanciaTotal()) {
                        entry.getKey().setDistanciaTotal(verticeAtual.getDistanciaTotal() + entry.getValue());
                         LinkedList<Vertice> menorCaminho = new LinkedList<>(verticeAtual.getMenorCaminho());
                         menorCaminho.add(verticeAtual);
                         entry.getKey().setMenorCaminho(menorCaminho);
    }
                
                naoVisitado.add(entry.getKey());
            }
        }
        visitados.add(verticeAtual);
    }
    return grafo;
}

}

