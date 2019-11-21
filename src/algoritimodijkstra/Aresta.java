/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algoritimodijkstra;

/**
 *
 * @author felipe
 */
public class Aresta extends Vertice{
    public Vertice Inicio;
    public Vertice Fim;
    public int tamanho;

    public Vertice getInicio() {
        return Inicio;
    }

    public void setInicio(Vertice Inicio) {
        this.Inicio = Inicio;
    }

    public Vertice getFim() {
        return Fim;
    }

    public void setFim(Vertice Fim) {
        this.Fim = Fim;
    }
    
    public Aresta(Vertice v1, Vertice v2, int tamanho){
        this.Inicio = v1;
        this.Fim = v2;
        this.tamanho = tamanho;
        addAresta(v1, v2, tamanho);
    
    }
    
    public void addAresta(Vertice v1, Vertice v2,int tamanho){
        v1.addAdjacente(v2, tamanho);
        v2.addAdjacente(v1, tamanho);
    
    
    }
 
}
