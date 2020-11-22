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
    void caseTTipoInt(TTipoInt node);
    void caseTTipoReal(TTipoReal node);
    void caseTTipoBool(TTipoBool node);
    void caseTVirgula(TVirgula node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTSe(TSe node);
    void caseTEntao(TEntao node);
    void caseTSenao(TSenao node);
    void caseTVerdade(TVerdade node);
    void caseTFalso(TFalso node);
    void caseTIgual(TIgual node);
    void caseTMenorQue(TMenorQue node);
    void caseTMaiorQue(TMaiorQue node);
    void caseTNegacaoBooleana(TNegacaoBooleana node);
    void caseTOperadoresLogicos(TOperadoresLogicos node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTNumeroInteiro(TNumeroInteiro node);
    void caseTSoma(TSoma node);
    void caseTSubt(TSubt node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTIdentificador(TIdentificador node);
    void caseTVazio(TVazio node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
