/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneumann.analysis;

import nonneumann.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTEntrar(TEntrar node);
    void caseTParEsq(TParEsq node);
    void caseTParDir(TParDir node);
    void caseTFuncao(TFuncao node);
    void caseTConstante(TConstante node);
    void caseTFuncaoUnica(TFuncaoUnica node);
    void caseTColEsq(TColEsq node);
    void caseTColDir(TColDir node);
    void caseTTiposDados(TTiposDados node);
    void caseTVirgula(TVirgula node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTCondicional(TCondicional node);
    void caseTVerdade(TVerdade node);
    void caseTFalso(TFalso node);
    void caseTOperadoresComparacao(TOperadoresComparacao node);
    void caseTNegacaoBooleana(TNegacaoBooleana node);
    void caseTOperadoresLogicos(TOperadoresLogicos node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTNumeroInteiro(TNumeroInteiro node);
    void caseTOperadoresAritmeticos(TOperadoresAritmeticos node);
    void caseTIdentificador(TIdentificador node);
    void caseTVazio(TVazio node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
