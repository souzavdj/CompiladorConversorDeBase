/* Generated By:JavaCC: Do not edit this line. Conversor.java */
public class Conversor implements ConversorConstants {

    final static String Version = "0.0.1";

    public static void main(String args[]) throws ParseException, TokenMgrError {
        Conversor interpreter = new Conversor(System.in);
        interpreter.Start();
    }

  final public void Start() throws ParseException {
    Token t;
    String entrada = "0";
    String valor = "0";
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUMBER:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      t = jj_consume_token(NUMBER);
            entrada = t.image;
      valor = Conversor(entrada);
      jj_consume_token(EOL);
            System.out.println(valor);
    }
    jj_consume_token(0);
  }

  final public String Conversor(String entradaTerminal) throws ParseException {
    String valor;
        String separaEntrada [] = entradaTerminal.split("-");
        String entradaString = separaEntrada[0];
        String base = separaEntrada[1];
        if(base.equals("B") || base.equals("b")) {
            valor = ConversorBinario(entradaString);
        }
        else if (base.equals("O") || base.equals("o")) {
            valor = ConversorOctal(entradaString);
        }
        else if (base.equals("H") || base.equals("h")) {
            valor = ConversorHexa(entradaString);
        }
        else {
            valor = "0";
        }
        {if (true) return valor;}
    throw new Error("Missing return statement in function");
  }

  final public String ConversorBinario(String entradaString) throws ParseException {
    String accumulador;
        int entrada = Integer.parseInt(entradaString);
        int cont = 0;
        int base = 2;
        java.util.List<Integer> restos = new java.util.ArrayList<Integer>();
        while(entrada >= base) {
            restos.add(entrada%base);
            entrada = entrada/base;
            cont++;
        }
        String resposta = String.valueOf(entrada);
        for (int i = restos.size()-1; i >= 0; i--) {
            resposta += String.valueOf(restos.get(i));
        }
        accumulador = resposta;
        {if (true) return accumulador;}
    throw new Error("Missing return statement in function");
  }

  final public String ConversorOctal(String entradaString) throws ParseException {
    String accumulador;
        int entrada = Integer.parseInt(entradaString);
        int cont = 0;
        int base = 8;
        java.util.List<Integer> restos = new java.util.ArrayList<Integer>();
        while(entrada >= base) {
            restos.add(entrada%base);
            entrada = entrada/base;
            cont++;
        }
        String resposta = String.valueOf(entrada);
        for (int i = restos.size()-1; i >= 0; i--) {
            resposta += String.valueOf(restos.get(i));
        }
        accumulador = resposta;
        {if (true) return accumulador;}
    throw new Error("Missing return statement in function");
  }

  final public String ConversorHexa(String entradaString) throws ParseException {
    String accumulador;
        int entrada = Integer.parseInt(entradaString);
        int base = 16;
        java.util.List<String> restos = new java.util.ArrayList<String>();
        while(entrada >= base) {
            int resto = entrada%base;
            if (resto > 9) {
                restos.add(RetornaLetraHexa(resto));
            }
            else {
                restos.add(String.valueOf(resto));
            }
            entrada = entrada/base;
        }
        String resposta = "";
        if(entrada > 9) {
            resposta = RetornaLetraHexa(entrada);
        }
        else {
            resposta = String.valueOf(entrada);
        }
        for (int i = restos.size()-1; i >= 0; i--) {
            resposta += restos.get(i);
        }
        accumulador = resposta;
        {if (true) return accumulador;}
    throw new Error("Missing return statement in function");
  }

  final public String RetornaLetraHexa(int numero) throws ParseException {
    Token t;
        String letra = "";
        switch (numero) {
            case 10: letra = "A"; break;
            case 11: letra = "B"; break;
            case 12: letra = "C"; break;
            case 13: letra = "D"; break;
            case 14: letra = "E"; break;
            case 15: letra = "F"; break;
        }
        {if (true) return letra;}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public ConversorTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[1];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x80,};
   }

  /** Constructor with InputStream. */
  public Conversor(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Conversor(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ConversorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Conversor(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ConversorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Conversor(ConversorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ConversorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[14];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 1; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 14; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
