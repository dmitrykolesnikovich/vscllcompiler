package pl.mateuszkalinowski.vscllcompiler.llvm;

class LLVMGenerator{

    private static String header_text = "";
    private static String main_text = "";
    static int reg = 1;
    private static int str_i = 5;

    static void print_i8_table_element(String id, String size, String index) {
        main_text += " %"+reg+" = getelementptr inbounds ["+size+" x i8], ["+size+" x i8]* %"+id+", i64 0, i64 "+index+"\n";
        reg++;
        main_text += "%"+reg+" = load i8, i8* %"+(reg-1)+", align 1\n";
        reg++;
        main_text += "%"+reg+" = sext i8 %"+(reg-1)+" to i32\n";
        reg++;
        main_text += "%"+reg+ " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.4, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void print_i8(String id){
        main_text += "%"+reg+" = load i8, i8* "+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i8 %"+(reg-1)+")\n";
        reg++;
    }

    static void print_i32(String id){
        main_text += "%"+reg+" = load i32, i32* "+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void print_double(String id){
        main_text += "%"+reg+" = load double, double* "+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
        reg++;
    }

    static void print_text_pointer(String id) {
        main_text += "%"+reg + " = load i8*, i8** "+ id +", align 8\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str.2, i32 0, i32 0), i8* %" + (reg-1) + ")\n";
        reg++;
    }

    static void print_static_string(String text){
        int str_len = text.length();
        String str_type = "["+(str_len+2)+" x i8]";
        header_text += "@.str."+str_i+" = constant"+str_type+" c\""+text+"\\0A\\00\"\n";
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( "+str_type+", "+str_type+"* @.str."+str_i+", i32 0, i32 0))\n";
        str_i++;
        reg++;
    }

    static void print_char_array(String id, String size) {
        main_text += "%"+reg+" = getelementptr inbounds ["+size+" x i8], ["+size+" x i8]* %"+id+", i32 0, i32 0\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.3, i32 0, i32 0), i8* %"+(reg-1)+")\n";
        reg++;
    }

    static void scan_i32(String id) {
        main_text += "%" + reg + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str, i32 0, i32 0), i32* "+ id + ")";
        reg++;
    }

    static void scan_i32_array(String id, String index, String size) {
        main_text += "%" + reg + " = getelementptr inbounds ["+size+" x i32], ["+size+" x i32]* %"+id+", i64 0, i64 "+index+"\n";
        reg++;
        main_text += "%" + reg + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str, i32 0, i32 0), i32* %"+ (reg-1) + ")\n";
        reg++;
    }

    static void scan_double(String id) {
        main_text += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), double* "+ id+ ")\n";
        reg++;
    }

    static void scan_double_array(String id, String index, String size) {
        main_text += "%" + reg + " = getelementptr inbounds ["+size+" x double], ["+size+" x double]* %"+id+", i64 0, i64 "+index+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), double* %"+ (reg-1)+ ")\n";
        reg++;
    }


    static void declare_i32(String id){
        main_text += "%"+id+" = alloca i32\n";
    }

    static void declare_double(String id){
        main_text += "%"+id+" = alloca double\n";
    }

    static void declare_text_pointer(String id) {
        main_text += "%"+id+" = alloca i8*, align 8\n";
    }

    static void declare_i32_array(String id, String size) {
        main_text += "%"+id+" = alloca ["+ size +" x i32], align 16\n";
    }

    static void declare_double_array(String id, String size) {
        main_text += "%"+id+" = alloca ["+ size +" x double], align 16\n";
    }

    static void declare_char_array(String id, String size) {
        main_text += "%"+id+" = alloca ["+size+" x i8], align 1\n";
    }

    static void assign_i8(String id, String value){
        main_text += "store i8 "+value+", i8* %"+id+"\n";
    }

    static void assign_i32(String id, String value){
        main_text += "store i32 "+value+", i32* %"+id+"\n";
    }

    static void assign_double(String id, String value){
        main_text += "store double "+value+", double* %"+id+"\n";
    }

    static void assign_text_pointer(String id, String text) {
        int str_len = text.length();
        String str_type = "["+(str_len+2)+" x i8]";
        header_text += "@.str."+str_i+" = constant"+str_type+" c\""+text+"\\0A\\00\"\n";
        str_i++;
        main_text += "store i8* getelementptr inbounds (" + str_type+", " + str_type+ "* @.str."+ (str_i-1) +", i32 0, i32 0), i8** %" + id + ", align 8\n";
    }

    static void assign_i32_array(String id, String index, String value, String size) {
        main_text += "%"+reg +" = getelementptr inbounds ["+size+" x i32], ["+ size +" x i32]* %"+id+", i64 0, i64 "+index+"\n";
        reg++;
        main_text += "store i32 "+value+", i32* %"+(reg-1)+", align 8\n";
    }

    static void assign_double_array(String id, String index, String value, String size) {
        main_text += "%"+reg +" = getelementptr inbounds ["+size+" x double], ["+ size +" x double]* %"+id+", i64 0, i64 "+index+"\n";
        reg++;
        main_text += "store double "+value+", double* %"+(reg-1)+", align 8\n";
    }

    static void assign_char_array(String id, String index, String value, String size) {
        main_text += "%"+reg +" = getelementptr inbounds ["+size+" x i8], ["+ size +" x i8]* %"+id+", i64 0, i64 "+index+"\n";
        reg++;
        main_text += "store i8 "+value+", i8* %"+(reg-1)+", align 1\n";
    }

    static void load_i32(String id){
        main_text += "%"+reg+" = load i32, i32* "+id+"\n";
        reg++;
    }

    static void load_double(String id){
        main_text += "%"+reg+" = load double, double* "+id+"\n";
        reg++;
    }

    static void load_i8_array(String id, String index, String size) {
        main_text += "%"+reg+" = getelementptr inbounds ["+size+" x i8], ["+size+" x i8]* %"+id+", i64 0, i64 "+index+"\n";
        reg++;
        main_text += "%"+reg+" = load i8, i8* %"+(reg-1)+", align 1\n";
        reg++;
    }

    static void load_i32_array(String id, String index, String size) {
        main_text += "%"+reg+" = getelementptr inbounds ["+size+" x i32], ["+size+" x i32]* %"+id+", i64 0, i64 "+index+"\n";
        reg++;
        main_text += "%"+reg+" = load i32, i32* %"+(reg-1)+", align 8\n";
        reg++;
    }

    static void load_double_array(String id, String index, String size) {
        main_text += "%"+reg+" = getelementptr inbounds ["+size+" x double], ["+size+" x double]* %"+id+", i64 0, i64 "+index+"\n";
        reg++;
        main_text += "%"+reg+" = load double, double* %"+(reg-1)+", align 16\n";
        reg++;
    }

    static void add_i32(String val1, String val2){
        main_text += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void add_double(String val1, String val2){
        main_text += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
        reg++;
    }

    static void sub_i32(String val1, String val2){
        main_text += "%"+reg+" = sub i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void sub_double(String val1, String val2){
        main_text += "%"+reg+" = fsub double "+val1+", "+val2+"\n";
        reg++;
    }

    static void mult_i32(String val1, String val2){
        main_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void mult_double(String val1, String val2){
        main_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
        reg++;
    }

    static void sitofp(String id){
        main_text += "%"+reg+" = sitofp i32 "+id+" to double\n";
        reg++;
    }

    static void fptosi(String id){
        main_text += "%"+reg+" = fptosi double "+id+" to i32\n";
        reg++;
    }

    //ETAP ||

    static void compare_i32(String id1, String id2) {
        main_text += "%"+reg+" = icmp eq i32 "+id1+", "+id2+"\n";
        reg++;
    }

    static void compare_double(String id1, String id2) {
        main_text += "%"+reg+" = fcmp oeq double "+id1+", "+id2+"\n";
        reg++;
    }

    static void static_jump() {
        main_text += "br label %"+reg+"\n";
    }

    static String conditional_jump(){
        String line = "br i1 %"+(reg-1)+", label %"+reg+", label\n";
        main_text += line;
        return line;
    }

    static void conditional_jump_finish(String line) {
       main_text = main_text.replaceAll(line,line + " %"+reg);
    }

    static void label(String preds) {
        main_text += "\n; <label>:"+reg+":                                     ; preds = " + preds + "\n";
        reg++;
    }


    static String generate(){
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @scanf(i8*, ...)\n";
        text += "@strp = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@.str = constant [3 x i8] c\"%d\\00\"\n";
        text += "@.str.1 = constant [4 x i8] c\"%lf\\00\"\n";
        text += "@.str.2 = constant [3 x i8] c\"%s\\00\"\n";
        text += "@.str.3 = constant [4 x i8] c\"%s\\0A\\00\"\n";
        text += "@.str.4 = constant [4 x i8] c\"%c\\0A\\00\", align 1";
        text += header_text;
        text += "define i32 @main() nounwind{\n";
        text += "%tmp8 = alloca i8\n";
        text += "%tmpi = alloca i32\n";
        text += "%tmpd = alloca double\n";
        text += main_text;
        text += "ret i32 0 }\n";
        return text;
    }

}
