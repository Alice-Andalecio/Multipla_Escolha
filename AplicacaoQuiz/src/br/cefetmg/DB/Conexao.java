package br.cefetmg.DB;

import java.sql.Connection;

public class Conexao{
    private static Conexao conexao;
    private static IConexao Iconexao;
    
    private Conexao(){
        Conexao.Iconexao = new SqlConexao(); 
    }
   public static Conexao getInstance(){
       if(conexao == null){
           conexao = new Conexao();
       }
       return conexao;
   }
   public Connection getConnection(){
       return Conexao.Iconexao.getConnection();
   }
}
