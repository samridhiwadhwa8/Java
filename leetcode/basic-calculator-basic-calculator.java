            else if(c==')'){
            }
                sign=1;
                ans=0;
                ans+=(num*sign);
                num=0;
                ans*=st.pop();
                ans+=st.pop();
                st.push(sign);
                st.push(ans);
            else if(c=='('){
            }
            }
