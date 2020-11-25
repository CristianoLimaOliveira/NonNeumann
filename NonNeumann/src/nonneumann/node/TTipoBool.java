/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneumann.node;

import nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TTipoBool extends Token
{
    public TTipoBool()
    {
        super.setText("bool");
    }

    public TTipoBool(int line, int pos)
    {
        super.setText("bool");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTipoBool(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTipoBool(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTipoBool text.");
    }
}
