/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneumann.lexer;

import java.io.*;
import nonneumann.node.*;

@SuppressWarnings("nls")
public class Lexer
{
    protected Token token;
    protected State state = State.INITIAL;

    private IPushbackReader in;
    private int line;
    private int pos;
    private boolean cr;
    private boolean eof;
    private final StringBuffer text = new StringBuffer();

    @SuppressWarnings("unused")
    protected void filter() throws LexerException, IOException
    {
        // Do nothing
    }

    public Lexer(@SuppressWarnings("hiding") final PushbackReader in)
    {
        this.in = new IPushbackReader() {

            private PushbackReader pushbackReader = in;
            
            @Override
            public void unread(int c) throws IOException {
                pushbackReader.unread(c);
            }
            
            @Override
            public int read() throws IOException {
                return pushbackReader.read();
            }
        };
    }
 
    public Lexer(@SuppressWarnings("hiding") IPushbackReader in)
    {
        this.in = in;
    }
 
    public Token peek() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        return this.token;
    }

    public Token next() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        Token result = this.token;
        this.token = null;
        return result;
    }

    protected Token getToken() throws IOException, LexerException
    {
        int dfa_state = 0;

        int start_pos = this.pos;
        int start_line = this.line;

        int accept_state = -1;
        int accept_token = -1;
        int accept_length = -1;
        int accept_pos = -1;
        int accept_line = -1;

        @SuppressWarnings("hiding") int[][][] gotoTable = Lexer.gotoTable[this.state.id()];
        @SuppressWarnings("hiding") int[] accept = Lexer.accept[this.state.id()];
        this.text.setLength(0);

        while(true)
        {
            int c = getChar();

            if(c != -1)
            {
                switch(c)
                {
                case 10:
                    if(this.cr)
                    {
                        this.cr = false;
                    }
                    else
                    {
                        this.line++;
                        this.pos = 0;
                    }
                    break;
                case 13:
                    this.line++;
                    this.pos = 0;
                    this.cr = true;
                    break;
                default:
                    this.pos++;
                    this.cr = false;
                    break;
                }

                this.text.append((char) c);

                do
                {
                    int oldState = (dfa_state < -1) ? (-2 -dfa_state) : dfa_state;

                    dfa_state = -1;

                    int[][] tmp1 =  gotoTable[oldState];
                    int low = 0;
                    int high = tmp1.length - 1;

                    while(low <= high)
                    {
                        // int middle = (low + high) / 2;
                        int middle = (low + high) >>> 1;
                        int[] tmp2 = tmp1[middle];

                        if(c < tmp2[0])
                        {
                            high = middle - 1;
                        }
                        else if(c > tmp2[1])
                        {
                            low = middle + 1;
                        }
                        else
                        {
                            dfa_state = tmp2[2];
                            break;
                        }
                    }
                }while(dfa_state < -1);
            }
            else
            {
                dfa_state = -1;
            }

            if(dfa_state >= 0)
            {
                if(accept[dfa_state] != -1)
                {
                    accept_state = dfa_state;
                    accept_token = accept[dfa_state];
                    accept_length = this.text.length();
                    accept_pos = this.pos;
                    accept_line = this.line;
                }
            }
            else
            {
                if(accept_state != -1)
                {
                    switch(accept_token)
                    {
                    case 0:
                        {
                            @SuppressWarnings("hiding") Token token = new0(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 1:
                        {
                            @SuppressWarnings("hiding") Token token = new1(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 2:
                        {
                            @SuppressWarnings("hiding") Token token = new2(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 3:
                        {
                            @SuppressWarnings("hiding") Token token = new3(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 4:
                        {
                            @SuppressWarnings("hiding") Token token = new4(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 5:
                        {
                            @SuppressWarnings("hiding") Token token = new5(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 6:
                        {
                            @SuppressWarnings("hiding") Token token = new6(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 7:
                        {
                            @SuppressWarnings("hiding") Token token = new7(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 8:
                        {
                            @SuppressWarnings("hiding") Token token = new8(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 9:
                        {
                            @SuppressWarnings("hiding") Token token = new9(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 10:
                        {
                            @SuppressWarnings("hiding") Token token = new10(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 11:
                        {
                            @SuppressWarnings("hiding") Token token = new11(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 12:
                        {
                            @SuppressWarnings("hiding") Token token = new12(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 13:
                        {
                            @SuppressWarnings("hiding") Token token = new13(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 14:
                        {
                            @SuppressWarnings("hiding") Token token = new14(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 15:
                        {
                            @SuppressWarnings("hiding") Token token = new15(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 16:
                        {
                            @SuppressWarnings("hiding") Token token = new16(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 17:
                        {
                            @SuppressWarnings("hiding") Token token = new17(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 18:
                        {
                            @SuppressWarnings("hiding") Token token = new18(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 19:
                        {
                            @SuppressWarnings("hiding") Token token = new19(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 20:
                        {
                            @SuppressWarnings("hiding") Token token = new20(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 21:
                        {
                            @SuppressWarnings("hiding") Token token = new21(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    }
                }
                else
                {
                    if(this.text.length() > 0)
                    {
                        throw new LexerException(
                            new InvalidToken(this.text.substring(0, 1), start_line + 1, start_pos + 1),
                            "[" + (start_line + 1) + "," + (start_pos + 1) + "]" +
                            " Unknown token: " + this.text);
                    }

                    @SuppressWarnings("hiding") EOF token = new EOF(
                        start_line + 1,
                        start_pos + 1);
                    return token;
                }
            }
        }
    }

    Token new0(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TEntrar(line, pos); }
    Token new1(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TParEsq(line, pos); }
    Token new2(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TParDir(line, pos); }
    Token new3(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TFuncao(line, pos); }
    Token new4(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TConstante(line, pos); }
    Token new5(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TFuncaoUnica(line, pos); }
    Token new6(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TColEsq(line, pos); }
    Token new7(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TColDir(line, pos); }
    Token new8(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTiposDados(text, line, pos); }
    Token new9(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TVirgula(line, pos); }
    Token new10(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDoisPontos(line, pos); }
    Token new11(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TCondicional(text, line, pos); }
    Token new12(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TVerdade(line, pos); }
    Token new13(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TFalso(line, pos); }
    Token new14(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TOperadoresComparacao(text, line, pos); }
    Token new15(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNegacaoBooleana(line, pos); }
    Token new16(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TOperadoresLogicos(text, line, pos); }
    Token new17(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNumeroReal(text, line, pos); }
    Token new18(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNumeroInteiro(text, line, pos); }
    Token new19(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TOperadoresAritmeticos(text, line, pos); }
    Token new20(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TIdentificador(text, line, pos); }
    Token new21(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TVazio(text, line, pos); }

    private int getChar() throws IOException
    {
        if(this.eof)
        {
            return -1;
        }

        int result = this.in.read();

        if(result == -1)
        {
            this.eof = true;
        }

        return result;
    }

    private void pushBack(int acceptLength) throws IOException
    {
        int length = this.text.length();
        for(int i = length - 1; i >= acceptLength; i--)
        {
            this.eof = false;

            this.in.unread(this.text.charAt(i));
        }
    }

    protected void unread(@SuppressWarnings("hiding") Token token) throws IOException
    {
        @SuppressWarnings("hiding") String text = token.getText();
        int length = text.length();

        for(int i = length - 1; i >= 0; i--)
        {
            this.eof = false;

            this.in.unread(text.charAt(i));
        }

        this.pos = token.getPos() - 1;
        this.line = token.getLine() - 1;
    }

    private String getText(int acceptLength)
    {
        StringBuffer s = new StringBuffer(acceptLength);
        for(int i = 0; i < acceptLength; i++)
        {
            s.append(this.text.charAt(i));
        }

        return s.toString();
    }

    private static int[][][][] gotoTable;
/*  {
        { // INITIAL
            {{9, 9, 1}, {10, 10, 2}, {13, 13, 3}, {32, 32, 4}, {33, 33, 5}, {37, 37, 6}, {40, 40, 7}, {41, 41, 8}, {42, 42, 9}, {43, 43, 10}, {44, 44, 11}, {45, 45, 12}, {47, 47, 13}, {48, 48, 14}, {49, 57, 15}, {58, 58, 16}, {60, 60, 17}, {61, 61, 18}, {62, 62, 19}, {65, 90, 20}, {91, 91, 21}, {93, 93, 22}, {95, 95, 23}, {97, 97, 24}, {98, 98, 25}, {99, 99, 26}, {100, 100, 20}, {101, 101, 27}, {102, 102, 28}, {103, 104, 20}, {105, 105, 29}, {106, 107, 20}, {108, 108, 30}, {109, 110, 20}, {111, 111, 31}, {112, 113, 20}, {114, 114, 32}, {115, 115, 20}, {116, 116, 33}, {117, 122, 20}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {{46, 46, 34}, {48, 57, 15}, {69, 69, 35}, {120, 120, 36}, },
            {{46, 69, -16}, },
            {},
            {},
            {},
            {},
            {{65, 90, 20}, {95, 95, 23}, {97, 122, 20}, },
            {},
            {},
            {{65, 122, -22}, },
            {{65, 95, -22}, {97, 109, 20}, {110, 110, 37}, {111, 122, 20}, },
            {{65, 95, -22}, {97, 110, 20}, {111, 111, 38}, {112, 122, 20}, },
            {{65, 110, -27}, {111, 111, 39}, {112, 122, 20}, },
            {{65, 95, -22}, {97, 107, 20}, {108, 108, 40}, {109, 109, 20}, {110, 110, 41}, {111, 122, 20}, },
            {{65, 95, -22}, {97, 97, 42}, {98, 116, 20}, {117, 117, 43}, {118, 122, 20}, },
            {{65, 95, -22}, {97, 101, 20}, {102, 102, 44}, {103, 109, 20}, {110, 110, 45}, {111, 122, 20}, },
            {{65, 95, -22}, {97, 97, 46}, {98, 122, 20}, },
            {{65, 95, -22}, {97, 113, 20}, {114, 114, 47}, {115, 122, 20}, },
            {{65, 95, -22}, {97, 100, 20}, {101, 101, 48}, {102, 122, 20}, },
            {{65, 95, -22}, {97, 103, 20}, {104, 104, 49}, {105, 113, 20}, {114, 114, 50}, {115, 122, 20}, },
            {{48, 57, 51}, },
            {{45, 45, 52}, },
            {{48, 57, 53}, {65, 70, 54}, {97, 102, 55}, },
            {{65, 95, -22}, {97, 99, 20}, {100, 100, 56}, {101, 122, 20}, },
            {{65, 110, -27}, {111, 111, 57}, {112, 122, 20}, },
            {{65, 109, -26}, {110, 110, 58}, {111, 122, 20}, },
            {{65, 95, -22}, {97, 114, 20}, {115, 115, 59}, {116, 122, 20}, },
            {{65, 95, -22}, {97, 115, 20}, {116, 116, 60}, {117, 122, 20}, },
            {{65, 107, -29}, {108, 108, 61}, {109, 122, 20}, },
            {{65, 109, -26}, {110, 110, 62}, {111, 122, 20}, },
            {{65, 122, -22}, },
            {{65, 115, -43}, {116, 116, 63}, {117, 122, 20}, },
            {{65, 95, -22}, {97, 108, 20}, {109, 109, 64}, {110, 122, 20}, },
            {{65, 122, -22}, },
            {{65, 95, -22}, {97, 97, 65}, {98, 122, 20}, },
            {{65, 100, -34}, {101, 101, 66}, {102, 122, 20}, },
            {{65, 95, -22}, {97, 116, 20}, {117, 117, 67}, {118, 122, 20}, },
            {{48, 57, 51}, },
            {{48, 57, 68}, },
            {{48, 102, -38}, },
            {{48, 102, -38}, },
            {{48, 102, -38}, },
            {{65, 122, -22}, },
            {{65, 107, -29}, {108, 108, 69}, {109, 122, 20}, },
            {{65, 114, -42}, {115, 115, 70}, {116, 122, 20}, },
            {{65, 100, -34}, {101, 101, 71}, {102, 122, 20}, },
            {{65, 113, -33}, {114, 114, 72}, {115, 122, 20}, },
            {{65, 114, -42}, {115, 115, 73}, {116, 122, 20}, },
            {{65, 95, -22}, {97, 98, 20}, {99, 99, 74}, {100, 122, 20}, },
            {{65, 122, -22}, },
            {{65, 95, -22}, {97, 97, 20}, {98, 98, 75}, {99, 122, 20}, },
            {{65, 107, -29}, {108, 108, 76}, {109, 122, 20}, },
            {{65, 109, -26}, {110, 110, 77}, {111, 122, 20}, },
            {{65, 100, -34}, {101, 101, 78}, {102, 122, 20}, },
            {{48, 57, 68}, },
            {{65, 122, -22}, },
            {{65, 115, -43}, {116, 116, 79}, {117, 122, 20}, },
            {{65, 122, -22}, },
            {{65, 95, -22}, {97, 120, 20}, {121, 121, 80}, {122, 122, 20}, },
            {{65, 100, -34}, {101, 101, 81}, {102, 122, 20}, },
            {{65, 115, -43}, {116, 116, 82}, {117, 122, 20}, },
            {{65, 99, -39}, {100, 100, 83}, {101, 122, 20}, },
            {{65, 122, -22}, },
            {{65, 122, -22}, },
            {{65, 122, -22}, },
            {{65, 122, -22}, },
            {{65, 122, -22}, },
            {{65, 122, -22}, },
            {{65, 95, -22}, {97, 104, 20}, {105, 105, 84}, {106, 122, 20}, },
            {{65, 95, -22}, {97, 97, 85}, {98, 122, 20}, },
            {{65, 110, -27}, {111, 111, 86}, {112, 122, 20}, },
            {{65, 122, -22}, },
            {{65, 109, -26}, {110, 110, 87}, {111, 122, 20}, },
            {{65, 122, -22}, },
        }
    };*/

    private static int[][] accept;
/*  {
        // INITIAL
        {-1, 21, 21, 21, 21, 15, 19, 1, 2, 19, 19, 9, 19, 19, 18, 18, 10, 14, 14, 14, 20, 6, 7, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, -1, -1, -1, 20, 20, 20, 20, 20, 20, 20, 11, 20, 20, 16, 20, 20, 20, 17, -1, 18, 18, 18, 16, 20, 20, 20, 20, 20, 20, 8, 20, 20, 20, 20, 17, 8, 20, 11, 20, 20, 20, 20, 8, 11, 12, 4, 0, 13, 20, 20, 20, 5, 20, 3, },

    };*/

    public static class State
    {
        public final static State INITIAL = new State(0);

        private int id;

        private State(@SuppressWarnings("hiding") int id)
        {
            this.id = id;
        }

        public int id()
        {
            return this.id;
        }
    }

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Lexer.class.getResourceAsStream("lexer.dat")));

            // read gotoTable
            int length = s.readInt();
            gotoTable = new int[length][][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][][];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                    length = s.readInt();
                    gotoTable[i][j] = new int[length][3];
                    for(int k = 0; k < gotoTable[i][j].length; k++)
                    {
                        for(int l = 0; l < 3; l++)
                        {
                            gotoTable[i][j][k][l] = s.readInt();
                        }
                    }
                }
            }

            // read accept
            length = s.readInt();
            accept = new int[length][];
            for(int i = 0; i < accept.length; i++)
            {
                length = s.readInt();
                accept[i] = new int[length];
                for(int j = 0; j < accept[i].length; j++)
                {
                    accept[i][j] = s.readInt();
                }
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"lexer.dat\" is either missing or corrupted.");
        }
    }
}
