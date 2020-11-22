/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneumann.node;

import nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TParDir extends Token
{
    public TParDir()
    {
        super.setText(")");
    }

    public TParDir(int line, int pos)
    {
        super.setText(")");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TParDir(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTParDir(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TParDir text.");
    }
}
