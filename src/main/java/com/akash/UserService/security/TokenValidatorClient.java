//package com.akash.UserService.security;
//
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//public class TokenValidatorClient {
//    public String validateToken(String token) {
//        String url = "http://localhost:8081/api/auth/validate?token=" + token;
//        RestTemplate restTemplate = new RestTemplate();
//        try {
//            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
//            return response.getBody(); // return username/email
//        } catch (Exception e) {
//            throw new RuntimeException("Unauthorized: Invalid or Expired Token");
//        }
//    }
//}
//
////@Component
////public class JwtAuthenticationFilter extends OncePerRequestFilter {
////
////    @Autowired
////    private JwtUtil jwtUtil;
////
////    @Override
////    protected void doFilterInternal(HttpServletRequest request,
////                                    HttpServletResponse response,
////                                    FilterChain filterChain) throws ServletException, IOException {
////
////        String authHeader = request.getHeader("Authorization");
////
////        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
////            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Missing or invalid token");
////            return;
////        }
////
////        String token = authHeader.substring(7);
////        if (!jwtUtil.validateToken(token)) {
////            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid token");
////            return;
////        }
////
////        String username = jwtUtil.extractUsername(token);
////        request = new HttpServletRequestWrapper(request) {
////            @Override
////            public String getHeader(String name) {
////                if ("X-User-Name".equals(name)) {
////                    return username;
////                }
////                return super.getHeader(name);
////            }
////        };
////
////        filterChain.doFilter(request, response);
////    }
////}